package com.rohan.springboot.restfileprocessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class RestfileprocessingApplicationTests {

	private static final String DOWNLOAD_PATH = "C:/D-drive/Shared/Downloads/";

	private static final String FILE_DOWNLOAD_URL = "http://localhost:8080/fileprocessing/download/";

	private static final String FILE_UPLOAD_URL = "http://localhost:8080/fileprocessing/upload";

	@Autowired
	RestTemplate restTemplate;

	@Test
	void testUpload() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
		body.add("file", new ClassPathResource("CopiedImage.jpg"));

		HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(body, headers);

		ResponseEntity<Boolean> response = restTemplate.postForEntity(FILE_UPLOAD_URL, httpEntity, Boolean.class);

		System.out.println(response.getBody());
	}

	@Test
	void testDownload() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_OCTET_STREAM));

		HttpEntity<String> httpEntity = new HttpEntity<>(headers);

		String fileName = "CopiedImage.jpg";

		ResponseEntity<byte[]> response = restTemplate.exchange(FILE_DOWNLOAD_URL + fileName, HttpMethod.GET,
				httpEntity, byte[].class);

		Files.write(Paths.get(DOWNLOAD_PATH + fileName), response.getBody());
	}

}

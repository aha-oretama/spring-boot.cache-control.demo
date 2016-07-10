package api.aha.oretama.jp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InternalApiController {

	@RequestMapping(path = "api/v1/internal-response", method = RequestMethod.GET)
	public String getInternalApiResponse() {

		// https://jira.spring.io/browse/SPR-5821
		// RestTemplate does not support cache.
		// Therefore, every request is not reused.
		RestTemplate restTemplate = new RestTemplate();
		String object = restTemplate.getForObject("http://localhost:8080/api/v1/prefectures/random", String.class);
		System.out.println(object.toString());

		return object;
	}

}

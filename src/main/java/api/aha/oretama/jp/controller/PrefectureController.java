package api.aha.oretama.jp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrefectureController {

	@RequestMapping(path = "api/v1/prefectures", method = RequestMethod.GET)
	public List<String> getPrefectures() {
		return Arrays.asList("東京都", "埼玉県", "神奈川県", "千葉県");
	}

	@RequestMapping(path = "api/v1/prefectures/tokyo", method = RequestMethod.GET)
	public String getPrefecture() {
		return "東京都";
	}

	@RequestMapping(path = "api/v1/prefectures/random", method = RequestMethod.GET)
	public String getRandomPrefecture() {

		List<String> prefectures = Arrays.asList("東京都", "埼玉県", "神奈川県", "千葉県", "栃木県", "群馬県", "山梨県", "茨城県", "岩手県", "静岡県");

		Integer random = (int) (Math.floor(Math.random() * 10));
		System.out.println(random);

		return prefectures.get(random);
	}

}

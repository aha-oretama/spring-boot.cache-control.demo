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
}

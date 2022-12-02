package starter.spring.aop.domain.service;

/**
 * Created by Yoo Ju Jin(jujin1324@daum.net)
 * Created Date : 2022/12/02
 */
public class SampleService {
    public String getSample(String key, Long value) {
        return key + ":" + value;
    }
}

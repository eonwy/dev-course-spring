package adaptor.api.kakao;

public class KakaoApi {

    public KakaoProfile getProfile(String token) {
        return new KakaoProfile("kakao user", "kakao@kakao.com");
    }
}

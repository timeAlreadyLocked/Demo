package demo.spring.external;

/**
 * @author LiPengJu
 * @date 2018/9/1
 */
public class TencentAiSDK {
    private final TencentBase tencentBase;

    public TencentAiSDK(TencentBase tencentBase) {
        this.tencentBase = tencentBase;
    }

    public String getTextByPicture() {
        return "I am Ai";
    }
}

package rci.api;

import lombok.Getter;

@Getter
public class NotFoundException extends ApiException {
	private static final long serialVersionUID = 1L;
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}

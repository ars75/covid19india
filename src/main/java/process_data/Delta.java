package process_data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Delta {

	@SerializedName("confirmed")
	@Expose
	private Integer confirmed;

	public Integer getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}
}
package org.tendo.patientfeedback.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE)
public class PFRequest {
	@NotBlank
    @NotNull(message = "name may not be null")
    @JsonProperty("name")
	private String name;
	
    @NotNull(message = "recommendation may not be null")
    @JsonProperty("recommendation")
    private Integer recommendation;
    
	@NotBlank
    @NotNull(message = "managediagonsis may not be null")
    @JsonProperty("managediagonsis")
    private String managediagonsis;
	
	@NotBlank
    @NotNull(message = "feedback may not be null")
    @JsonProperty("feedback")
    private String feedback;
	
	@NotBlank
    @NotNull(message = "patientId may not be null")
    @JsonProperty("patientId")
	private String patientId;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(Integer recommendation) {
		this.recommendation = recommendation;
	}
	public String getManagediagonsis() {
		return managediagonsis;
	}
	public void setManagediagonsis(String managediagonsis) {
		this.managediagonsis = managediagonsis;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}

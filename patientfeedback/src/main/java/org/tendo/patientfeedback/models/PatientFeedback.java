package org.tendo.patientfeedback.models;

import java.lang.String;
import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;


@Data
@NoArgsConstructor
@Entity
@Table(name="newtable")
public class PatientFeedback {
	
	private String patientid;
    private String name;
    private Integer recommendation;
    private String managediagnosis;
    private String feedback;
    @Id
    private String patientfeedbackid;
    
    public String getPatientId() {return patientid;}
    public void setPatientid(String patientid) {this.patientid = patientid;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public Integer getRecommendation() {return recommendation;}
    public void setRecommendation(Integer recommendation) {this.recommendation = recommendation;}
    
    public String getManagediagonis() {return managediagnosis;}
    public void setManagediagonis(String managediagnosis) {this.managediagnosis = managediagnosis;}
    
    public String getFeedback() {return feedback;}
    public void setFeedback(String feedback) {this.feedback = feedback;}
    
    public String getPatientfeedbackid() {return patientfeedbackid;}
    public void setPatientfeedbackid(String patientfeedbackid) {this.patientfeedbackid = patientfeedbackid;}
    
	
}

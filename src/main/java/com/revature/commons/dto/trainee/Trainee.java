package com.revature.commons.dto.trainee;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.commons.dto.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Trainee {
    private Integer id;
    private TrainingStatus trainingStatus;
    private String phoneNumber;
    private String skypeId;
    private String profileUrl;
    private String recruiterName;
    private String college;
    private String degree;
    private String major;
    private String techScreener;
    private Boolean projectCompletion;
    private FlagStatus flagStatus;
    private Set<String> flagNotes;
    private Set<String> grades;
    private Set<String> notes;
    private Set<String> panelInterviews;
    private Set<String> totals;
    private MarketingStatus marketingStatus;
    private String client;
    private String endClient;
    private String traineeId;
    private User user;
}

package com.gjdw.pojo;

public class ScProject {
    private String projectId;

    private String projectName;

    private String projectField;

    private String province;

    private String city;

    private String projectStep;

    private String projectResource;

    private String projectBrief;

    private String priUrl;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectField() {
        return projectField;
    }

    public void setProjectField(String projectField) {
        this.projectField = projectField;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProjectStep() {
        return projectStep;
    }

    public void setProjectStep(String projectStep) {
        this.projectStep = projectStep;
    }

    public String getProjectResource() {
        return projectResource;
    }

    public void setProjectResource(String projectResource) {
        this.projectResource = projectResource;
    }

    public String getProjectBrief() {
        return projectBrief;
    }

    public void setProjectBrief(String projectBrief) {
        this.projectBrief = projectBrief;
    }

    public String getPriUrl() {
        return priUrl;
    }

    public void setPriUrl(String priUrl) {
        this.priUrl = priUrl;
    }

    @Override
    public String toString() {
        return "ScProject{" +
                "projectId='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectField='" + projectField + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", projectStep='" + projectStep + '\'' +
                ", projectResource='" + projectResource + '\'' +
                ", projectBrief='" + projectBrief + '\'' +
                ", priUrl='" + priUrl + '\'' +
                '}';
    }
}

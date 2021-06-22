package com.mponline.contentconfig.databases.entity;

import java.util.Date;

public class ChatRoom extends ChatRoomKey {
    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

    private Integer version;

    private String roomId;

    private Integer refServiceId;

    private Integer patientId;

    private String doctorId;

    private String nurseId;

    private String aidId;

    private String loseDate;

    private Integer operationId;

    private String operationCode;

    private Integer status;

    private String doctorName;

    private String nurseName;

    private String patientName;

    private String aidName;

    private String nearlyMsg;

    private String nearlyMsgTime;

    private String hospitalCode;

    private String hospitalName;

    private String departmentCode;

    private String departmentName;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getRefServiceId() {
        return refServiceId;
    }

    public void setRefServiceId(Integer refServiceId) {
        this.refServiceId = refServiceId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public String getAidId() {
        return aidId;
    }

    public void setAidId(String aidId) {
        this.aidId = aidId;
    }

    public String getLoseDate() {
        return loseDate;
    }

    public void setLoseDate(String loseDate) {
        this.loseDate = loseDate;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAidName() {
        return aidName;
    }

    public void setAidName(String aidName) {
        this.aidName = aidName;
    }

    public String getNearlyMsg() {
        return nearlyMsg;
    }

    public void setNearlyMsg(String nearlyMsg) {
        this.nearlyMsg = nearlyMsg;
    }

    public String getNearlyMsgTime() {
        return nearlyMsgTime;
    }

    public void setNearlyMsgTime(String nearlyMsgTime) {
        this.nearlyMsgTime = nearlyMsgTime;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
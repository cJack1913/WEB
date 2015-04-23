package com.cloud.app.model;

import java.util.Date;

public class Group {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_ID
     *
     * @mbggenerated
     */
    private Integer groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_NAME
     *
     * @mbggenerated
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_THEME
     *
     * @mbggenerated
     */
    private String groupTheme;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_BUILDER_ID
     *
     * @mbggenerated
     */
    private Integer groupBuilderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_LEADER_ID
     *
     * @mbggenerated
     */
    private Integer groupLeaderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_DEPUTY1_ID
     *
     * @mbggenerated
     */
    private Integer groupDeputy1Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_DEPUTY2_ID
     *
     * @mbggenerated
     */
    private Integer groupDeputy2Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_DEPUTY3_ID
     *
     * @mbggenerated
     */
    private Integer groupDeputy3Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.TOTAL_VOLUME
     *
     * @mbggenerated
     */
    private Long totalVolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.EXISTED_VOLUME
     *
     * @mbggenerated
     */
    private Long existedVolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.GROUP_TIME_BUILD
     *
     * @mbggenerated
     */
    private Date groupTimeBuild;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GROUP_TABLE.COMMENT
     *
     * @mbggenerated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_ID
     *
     * @return the value of GROUP_TABLE.GROUP_ID
     *
     * @mbggenerated
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_ID
     *
     * @param groupId the value for GROUP_TABLE.GROUP_ID
     *
     * @mbggenerated
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_NAME
     *
     * @return the value of GROUP_TABLE.GROUP_NAME
     *
     * @mbggenerated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_NAME
     *
     * @param groupName the value for GROUP_TABLE.GROUP_NAME
     *
     * @mbggenerated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_THEME
     *
     * @return the value of GROUP_TABLE.GROUP_THEME
     *
     * @mbggenerated
     */
    public String getGroupTheme() {
        return groupTheme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_THEME
     *
     * @param groupTheme the value for GROUP_TABLE.GROUP_THEME
     *
     * @mbggenerated
     */
    public void setGroupTheme(String groupTheme) {
        this.groupTheme = groupTheme == null ? null : groupTheme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_BUILDER_ID
     *
     * @return the value of GROUP_TABLE.GROUP_BUILDER_ID
     *
     * @mbggenerated
     */
    public Integer getGroupBuilderId() {
        return groupBuilderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_BUILDER_ID
     *
     * @param groupBuilderId the value for GROUP_TABLE.GROUP_BUILDER_ID
     *
     * @mbggenerated
     */
    public void setGroupBuilderId(Integer groupBuilderId) {
        this.groupBuilderId = groupBuilderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_LEADER_ID
     *
     * @return the value of GROUP_TABLE.GROUP_LEADER_ID
     *
     * @mbggenerated
     */
    public Integer getGroupLeaderId() {
        return groupLeaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_LEADER_ID
     *
     * @param groupLeaderId the value for GROUP_TABLE.GROUP_LEADER_ID
     *
     * @mbggenerated
     */
    public void setGroupLeaderId(Integer groupLeaderId) {
        this.groupLeaderId = groupLeaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_DEPUTY1_ID
     *
     * @return the value of GROUP_TABLE.GROUP_DEPUTY1_ID
     *
     * @mbggenerated
     */
    public Integer getGroupDeputy1Id() {
        return groupDeputy1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_DEPUTY1_ID
     *
     * @param groupDeputy1Id the value for GROUP_TABLE.GROUP_DEPUTY1_ID
     *
     * @mbggenerated
     */
    public void setGroupDeputy1Id(Integer groupDeputy1Id) {
        this.groupDeputy1Id = groupDeputy1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_DEPUTY2_ID
     *
     * @return the value of GROUP_TABLE.GROUP_DEPUTY2_ID
     *
     * @mbggenerated
     */
    public Integer getGroupDeputy2Id() {
        return groupDeputy2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_DEPUTY2_ID
     *
     * @param groupDeputy2Id the value for GROUP_TABLE.GROUP_DEPUTY2_ID
     *
     * @mbggenerated
     */
    public void setGroupDeputy2Id(Integer groupDeputy2Id) {
        this.groupDeputy2Id = groupDeputy2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_DEPUTY3_ID
     *
     * @return the value of GROUP_TABLE.GROUP_DEPUTY3_ID
     *
     * @mbggenerated
     */
    public Integer getGroupDeputy3Id() {
        return groupDeputy3Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_DEPUTY3_ID
     *
     * @param groupDeputy3Id the value for GROUP_TABLE.GROUP_DEPUTY3_ID
     *
     * @mbggenerated
     */
    public void setGroupDeputy3Id(Integer groupDeputy3Id) {
        this.groupDeputy3Id = groupDeputy3Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.TOTAL_VOLUME
     *
     * @return the value of GROUP_TABLE.TOTAL_VOLUME
     *
     * @mbggenerated
     */
    public Long getTotalVolume() {
        return totalVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.TOTAL_VOLUME
     *
     * @param totalVolume the value for GROUP_TABLE.TOTAL_VOLUME
     *
     * @mbggenerated
     */
    public void setTotalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.EXISTED_VOLUME
     *
     * @return the value of GROUP_TABLE.EXISTED_VOLUME
     *
     * @mbggenerated
     */
    public Long getExistedVolume() {
        return existedVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.EXISTED_VOLUME
     *
     * @param existedVolume the value for GROUP_TABLE.EXISTED_VOLUME
     *
     * @mbggenerated
     */
    public void setExistedVolume(Long existedVolume) {
        this.existedVolume = existedVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.GROUP_TIME_BUILD
     *
     * @return the value of GROUP_TABLE.GROUP_TIME_BUILD
     *
     * @mbggenerated
     */
    public Date getGroupTimeBuild() {
        return groupTimeBuild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.GROUP_TIME_BUILD
     *
     * @param groupTimeBuild the value for GROUP_TABLE.GROUP_TIME_BUILD
     *
     * @mbggenerated
     */
    public void setGroupTimeBuild(Date groupTimeBuild) {
        this.groupTimeBuild = groupTimeBuild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GROUP_TABLE.COMMENT
     *
     * @return the value of GROUP_TABLE.COMMENT
     *
     * @mbggenerated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GROUP_TABLE.COMMENT
     *
     * @param comment the value for GROUP_TABLE.COMMENT
     *
     * @mbggenerated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}
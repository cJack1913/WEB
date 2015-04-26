package com.cloud.app.model;

import org.springframework.stereotype.Repository;

@Repository
public class HDFS {
    @Override
	public String toString() {
		return "HDFS [fileId=" + fileId + ", fileMd5=" + fileMd5 + ", fileUrl="
				+ fileUrl + ", fileType=" + fileType + ", fileSize=" + fileSize
				+ ", comment=" + comment + "]";
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HDFS.FILE_ID
     *
     * @mbggenerated
     */
    private Integer fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HDFS.FILE_MD5
     *
     * @mbggenerated
     */
    private String fileMd5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HDFS.FILE_URL
     *
     * @mbggenerated
     */
    private String fileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HDFS.FILE_TYPE
     *
     * @mbggenerated
     */
    private String fileType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HDFS.FILE_SIZE
     *
     * @mbggenerated
     */
    private Long fileSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HDFS.COMMENT
     *
     * @mbggenerated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HDFS.FILE_ID
     *
     * @return the value of HDFS.FILE_ID
     *
     * @mbggenerated
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HDFS.FILE_ID
     *
     * @param fileId the value for HDFS.FILE_ID
     *
     * @mbggenerated
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HDFS.FILE_MD5
     *
     * @return the value of HDFS.FILE_MD5
     *
     * @mbggenerated
     */
    public String getFileMd5() {
        return fileMd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HDFS.FILE_MD5
     *
     * @param fileMd5 the value for HDFS.FILE_MD5
     *
     * @mbggenerated
     */
    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5 == null ? null : fileMd5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HDFS.FILE_URL
     *
     * @return the value of HDFS.FILE_URL
     *
     * @mbggenerated
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HDFS.FILE_URL
     *
     * @param fileUrl the value for HDFS.FILE_URL
     *
     * @mbggenerated
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HDFS.FILE_TYPE
     *
     * @return the value of HDFS.FILE_TYPE
     *
     * @mbggenerated
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HDFS.FILE_TYPE
     *
     * @param fileType the value for HDFS.FILE_TYPE
     *
     * @mbggenerated
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HDFS.FILE_SIZE
     *
     * @return the value of HDFS.FILE_SIZE
     *
     * @mbggenerated
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HDFS.FILE_SIZE
     *
     * @param fileSize the value for HDFS.FILE_SIZE
     *
     * @mbggenerated
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HDFS.COMMENT
     *
     * @return the value of HDFS.COMMENT
     *
     * @mbggenerated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HDFS.COMMENT
     *
     * @param comment the value for HDFS.COMMENT
     *
     * @mbggenerated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}
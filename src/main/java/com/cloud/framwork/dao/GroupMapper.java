package com.cloud.framwork.dao;

import com.cloud.app.model.Group;

import java.util.List;

public interface GroupMapper {
	
	 int myinsert(Group record);

	List<Group> selectAllGroups(Integer userId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GROUP_TABLE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GROUP_TABLE
     *
     * @mbggenerated
     */
    int insert(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GROUP_TABLE
     *
     * @mbggenerated
     */
    Group selectByPrimaryKey(Integer groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GROUP_TABLE
     *
     * @mbggenerated
     */
    List<Group> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GROUP_TABLE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Group record);
}
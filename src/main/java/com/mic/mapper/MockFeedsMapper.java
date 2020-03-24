package com.mic.mapper;

import com.mic.table.TableComment;
import com.mic.table.TableHotFeeds;
import com.mic.table.TableTagList;
import com.mic.table.TableUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MockFeedsMapper {

    int insertHotFeeds(TableHotFeeds feeds);


    int insertTag(TableTagList tagList);


    int insertComments(TableComment comment);


    int insertUser(TableUser user);
}

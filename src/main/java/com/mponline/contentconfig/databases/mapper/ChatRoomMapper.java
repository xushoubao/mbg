package com.mponline.contentconfig.databases.mapper;

import com.mponline.contentconfig.databases.entity.ChatRoom;
import com.mponline.contentconfig.databases.entity.ChatRoomKey;

public interface ChatRoomMapper {
    int deleteByPrimaryKey(ChatRoomKey key);

    int insert(ChatRoom record);

    int insertSelective(ChatRoom record);

    ChatRoom selectByPrimaryKey(ChatRoomKey key);

    int updateByPrimaryKeySelective(ChatRoom record);

    int updateByPrimaryKey(ChatRoom record);
}
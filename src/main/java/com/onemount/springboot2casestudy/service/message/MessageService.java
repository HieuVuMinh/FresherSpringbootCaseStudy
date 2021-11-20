package com.onemount.springboot2casestudy.service.message;


import com.onemount.springboot2casestudy.model.Message;
import com.onemount.springboot2casestudy.service.GeneralService;

public interface MessageService extends GeneralService<Message> {
    Iterable<Message> getPrivateMessages(Long senderId, Long receiverId);
}

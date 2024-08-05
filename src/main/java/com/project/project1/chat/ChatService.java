package com.project.project1.chat;

import com.project.project1.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ChatService {
    public static List<String> messages= new ArrayList<>();
    private final MessageRepository messageRepository;

    public void addMessage(Member sender, String content){
        Message message = new Message();
        message.setSender(sender);
        message.setContent(content);
        messageRepository.save(message);
    }

    public List<Message> getMessages(){
        List<Message> messages = messageRepository.findAll();
        return messages;
    }
}
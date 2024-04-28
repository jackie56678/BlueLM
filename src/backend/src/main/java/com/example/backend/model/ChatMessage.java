package com.example.backend.model;

import lombok.Data;
import java.util.Map;

@Data
public class ChatMessage {
    private String content;
    private String sessionId;
    private Map<String, String> queryParams;
}

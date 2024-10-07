package com.chat.chatBuddy.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private MessageType type;
    private String sender;
    private String content;

    private ChatMessage(Builder builder) {
        this.type = builder.type;
        this.sender = builder.sender;
        this.content = builder.content;
    }

    public static class Builder {
        private MessageType type;
        private String sender;
        private String content;

        public Builder type(MessageType type) {
            this.type = type;
            return this;
        }

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public ChatMessage build() {
            return new ChatMessage(this);
        }
    }
}

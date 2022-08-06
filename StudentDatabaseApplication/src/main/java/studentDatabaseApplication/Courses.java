package studentDatabaseApplication;

public enum Courses {
    HISTORY101("History"),
    MATHEMATICS101("Mathematics"),
    PHYSICS101("Physics"),
    ENGLISH101("English"),
    CHEMISTRY101("Chemistry"),
    COMPUTERSCIENCE101("Computer Science");

    private final String name;

    private Courses(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Courses toName(String name) {
        for (Courses course : values()) {
            if (course.getName().equals(name)) return course;
        }
        return null;
    }

    public Courses getCourse(String ){
        return Courses.get
    }
}


/*
        private MessageType(final String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return this.typeName;
        }

        public static MessageType toMessageType(String typeName) {
            for(MessageType v : values())
                if(v.getTypeName().equals(typeName)) return v;
            throw new IllegalArgumentException();
        }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Message getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(Message messageBody) {
        this.messageBody = messageBody;
    }

 */
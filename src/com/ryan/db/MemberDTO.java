package com.ryan.db;

public class MemberDTO {

        private String id;
        private String pw;
        private String name;
        private String email;
        private String phone;

        // ALT + SHIFT +S
        // Generate Getter and Setter
        // 자동으로 만들어짐

        
        
    // 외부에서 보내온 id값을 받는다
        public void setId(String id) {
                this.id = id;
        }
        // 받아온 id값을 외부로 보낸다
        // ex) 출력방법: 변수.getId();
        public String getId() {
                return id;
        }

        
        
        // 외부에서 보내온 pw값을 받는다
        public void setPw(String pw) {
                this.pw = pw;
        }
        // 받아온 pw값을 외부로 보낸다
        // ex) 출력방법: 변수.getPw();
        public String getPw() {
                return pw;
        }

        
        
        // 외부에서 보내온 name값을 받는다
        public void setName(String name) {
                this.name = name;
        }
        // 받아온 name값을 외부로 보낸다
        // ex) 출력방법: 변수.getName();
        public String getName() {
                return name;
        }
        
        
        
        // 외부에서 보내온 email값을 받는다
        public void setEmail(String email) {
                this.email = email;
        }
        // 받아온 email값을 외부로 보낸다
        // ex) 출력방법: 변수.getEmail();
        public String getEmail() {
                return email;
        }
        
        
        
        // 외부에서 보내온 phone값을 받는다
        public void setPhone(String phone) {
                this.phone = phone;
        }
        // 받아온 phone값을 외부로 보낸다
        // ex) 출력방법: 변수.getPhone();
        public String getPhone() {
                return phone;
        }

}

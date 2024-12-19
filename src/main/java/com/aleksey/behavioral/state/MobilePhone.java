package com.aleksey.behavioral.state;

public class MobilePhone {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void usePhone(){
        if(state instanceof PhoneOff) {
            setState(new PhoneBlocked());
        } else if(state instanceof PhoneBlocked) {
            setState(new PhoneUnblocked());
        } else if(state instanceof PhoneUnblocked) {
            setState(new PhoneUse());
        } else if(state instanceof PhoneUse) {
            setState(new PhoneOff());
        }
    }

    public void doSomething() {
        state.doSomething();
    }
}

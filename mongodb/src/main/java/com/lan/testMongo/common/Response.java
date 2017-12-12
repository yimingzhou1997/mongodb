package com.lan.testMongo.common;

/**
 * Created by tianxianglan on 2017/5/1.
 */
public class Response {
    private short status;
    private Object object;

    public Response() {
    }

    public Response(short status) {
        this.status = status;
    }

    public Response(short status, Object object) {
        this.status = status;
        this.object = object;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

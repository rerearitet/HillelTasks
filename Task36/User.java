package com.hillel.lombok.task36;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.*;
import java.util.Base64;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable, Externalizable {
    private int age;
    private String name;
    private String surname;
    private transient String password;

    private String encryptString(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    private String decryptString(String data) {
        return new String(Base64.getDecoder().decode(data));
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.age);
        out.writeObject(this.name);
        out.writeObject(this.surname);
        out.writeObject(this.encryptString(this.password));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.age = (int) in.readObject();
        this.name = (String) in.readObject();
        this.surname = (String) in.readObject();
        this.password = this.decryptString((String)in.readObject());
    }
}

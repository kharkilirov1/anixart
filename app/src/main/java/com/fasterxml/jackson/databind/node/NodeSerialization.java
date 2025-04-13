package com.fasterxml.jackson.databind.node;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import p000a.C0000a;

/* loaded from: classes.dex */
class NodeSerialization implements Serializable, Externalizable {
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization() {
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(InternalNodeMapper.valueToBytes(obj));
        } catch (IOException e2) {
            StringBuilder m24u = C0000a.m24u("Failed to JDK serialize `");
            m24u.append(obj.getClass().getSimpleName());
            m24u.append("` value: ");
            m24u.append(e2.getMessage());
            throw new IllegalArgumentException(m24u.toString(), e2);
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        int readInt = objectInput.readInt();
        byte[] bArr = new byte[readInt];
        this.json = bArr;
        objectInput.readFully(bArr, 0, readInt);
    }

    public Object readResolve() {
        try {
            return InternalNodeMapper.bytesToNode(this.json);
        } catch (IOException e2) {
            StringBuilder m24u = C0000a.m24u("Failed to JDK deserialize `JsonNode` value: ");
            m24u.append(e2.getMessage());
            throw new IllegalArgumentException(m24u.toString(), e2);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }
}

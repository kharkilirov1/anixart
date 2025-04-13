package com.fasterxml.jackson.databind.jsontype;

import androidx.room.util.C0576a;
import java.io.Serializable;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    public final Class<?> _class;
    public final int _hashCode;
    public String _name;

    public NamedType(Class<?> cls) {
        this(cls, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == NamedType.class && this._class == ((NamedType) obj)._class;
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getType() {
        return this._class;
    }

    public boolean hasName() {
        return this._name != null;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void setName(String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this._name = str;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("[NamedType, class ");
        C0576a.m4126y(this._class, m24u, ", name: ");
        return C0000a.m20q(m24u, this._name == null ? "null" : C0000a.m20q(C0000a.m24u("'"), this._name, "'"), "]");
    }

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode();
        setName(str);
    }
}

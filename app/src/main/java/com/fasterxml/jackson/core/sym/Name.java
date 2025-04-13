package com.fasterxml.jackson.core.sym;

/* loaded from: classes.dex */
public abstract class Name {
    public final int _hashCode;
    public final String _name;

    public Name(String str, int i2) {
        this._name = str;
        this._hashCode = i2;
    }

    public abstract boolean equals(int i2);

    public abstract boolean equals(int i2, int i3);

    public abstract boolean equals(int i2, int i3, int i4);

    public boolean equals(Object obj) {
        return obj == this;
    }

    public abstract boolean equals(int[] iArr, int i2);

    public String getName() {
        return this._name;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public String toString() {
        return this._name;
    }
}

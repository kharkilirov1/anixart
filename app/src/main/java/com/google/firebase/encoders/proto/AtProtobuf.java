package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public final class AtProtobuf {

    /* renamed from: a */
    public int f22589a;

    public static final class ProtobufImpl implements Protobuf {

        /* renamed from: a */
        public final int f22590a;

        /* renamed from: b */
        public final Protobuf.IntEncoding f22591b;

        public ProtobufImpl(int i2, Protobuf.IntEncoding intEncoding) {
            this.f22590a = i2;
            this.f22591b = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f22590a == ((ProtobufImpl) protobuf).f22590a && this.f22591b.equals(((ProtobufImpl) protobuf).f22591b);
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f22590a ^ 14552422) + (this.f22591b.hashCode() ^ 2041407134);
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f22590a + "intEncoding=" + this.f22591b + ')';
        }
    }

    /* renamed from: a */
    public Protobuf m12376a() {
        return new ProtobufImpl(this.f22589a, Protobuf.IntEncoding.DEFAULT);
    }
}

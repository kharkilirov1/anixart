package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* loaded from: classes2.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f22612a = false;

    /* renamed from: b */
    public boolean f22613b = false;

    /* renamed from: c */
    public FieldDescriptor f22614c;

    /* renamed from: d */
    public final ProtobufDataEncoderContext f22615d;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.f22615d = protobufDataEncoderContext;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    /* renamed from: c */
    public ValueEncoderContext mo12369c(@Nullable String str) throws IOException {
        if (this.f22612a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f22612a = true;
        this.f22615d.m12380c(this.f22614c, str, this.f22613b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    /* renamed from: d */
    public ValueEncoderContext mo12370d(boolean z) throws IOException {
        if (this.f22612a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f22612a = true;
        this.f22615d.m12381d(this.f22614c, z ? 1 : 0, this.f22613b);
        return this;
    }
}

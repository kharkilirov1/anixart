package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface ObjectEncoderContext {
    @NonNull
    /* renamed from: a */
    ObjectEncoderContext mo12365a(@NonNull FieldDescriptor fieldDescriptor, long j2) throws IOException;

    @NonNull
    /* renamed from: b */
    ObjectEncoderContext mo12366b(@NonNull FieldDescriptor fieldDescriptor, int i2) throws IOException;

    @NonNull
    /* renamed from: e */
    ObjectEncoderContext mo12367e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException;
}

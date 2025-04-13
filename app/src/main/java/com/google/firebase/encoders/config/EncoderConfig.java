package com.google.firebase.encoders.config;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;

/* loaded from: classes2.dex */
public interface EncoderConfig<T extends EncoderConfig<T>> {
    @NonNull
    /* renamed from: a */
    <U> T mo12371a(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder);
}

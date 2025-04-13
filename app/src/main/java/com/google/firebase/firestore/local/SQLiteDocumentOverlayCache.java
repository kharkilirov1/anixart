package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.mutation.Overlay;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p012v1.Write;
import com.google.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public class SQLiteDocumentOverlayCache implements DocumentOverlayCache {
    /* renamed from: a */
    public final Overlay m12407a(byte[] bArr, int i2) {
        try {
            Write.m12820I(bArr);
            throw null;
        } catch (InvalidProtocolBufferException e2) {
            Assert.m12489a("Overlay failed to parse: %s", e2);
            throw null;
        }
    }
}

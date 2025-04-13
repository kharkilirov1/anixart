package com.google.android.exoplayer2.metadata;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override // com.google.android.exoplayer2.metadata.MetadataDecoder
    @Nullable
    /* renamed from: a */
    public final Metadata mo6701a(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.f10605d;
        Objects.requireNonNull(byteBuffer);
        Assertions.m7513a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (metadataInputBuffer.m6241i()) {
            return null;
        }
        return mo6705b(metadataInputBuffer, byteBuffer);
    }

    @Nullable
    /* renamed from: b */
    public abstract Metadata mo6705b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);
}

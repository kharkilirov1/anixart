package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    /* renamed from: b */
    public Metadata mo6705b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return new Metadata(m6706c(new ParsableByteArray(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public EventMessage m6706c(ParsableByteArray parsableByteArray) {
        String m7651o = parsableByteArray.m7651o();
        Objects.requireNonNull(m7651o);
        String m7651o2 = parsableByteArray.m7651o();
        Objects.requireNonNull(m7651o2);
        return new EventMessage(m7651o, m7651o2, parsableByteArray.m7650n(), parsableByteArray.m7650n(), Arrays.copyOfRange(parsableByteArray.f14698a, parsableByteArray.f14699b, parsableByteArray.f14700c));
    }
}

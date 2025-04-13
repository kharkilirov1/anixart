package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public interface MediaChunkIterator {

    /* renamed from: a */
    public static final MediaChunkIterator f12750a = new MediaChunkIterator() { // from class: com.google.android.exoplayer2.source.chunk.MediaChunkIterator.1
        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        /* renamed from: a */
        public long mo6986a() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        /* renamed from: b */
        public long mo6987b() {
            throw new NoSuchElementException();
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public boolean next() {
            return false;
        }
    };

    /* renamed from: a */
    long mo6986a();

    /* renamed from: b */
    long mo6987b();

    boolean next();
}

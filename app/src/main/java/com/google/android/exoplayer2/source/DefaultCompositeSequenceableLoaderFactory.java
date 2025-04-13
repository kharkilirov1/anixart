package com.google.android.exoplayer2.source;

/* loaded from: classes.dex */
public final class DefaultCompositeSequenceableLoaderFactory implements CompositeSequenceableLoaderFactory {
    @Override // com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory
    /* renamed from: a */
    public SequenceableLoader mo6805a(SequenceableLoader... sequenceableLoaderArr) {
        return new CompositeSequenceableLoader(sequenceableLoaderArr);
    }
}

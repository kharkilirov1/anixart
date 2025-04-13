package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class FilteringManifestParser<T extends FilterableManifest<T>> implements ParsingLoadable.Parser<T> {

    /* renamed from: a */
    public final ParsingLoadable.Parser<? extends T> f12185a;

    /* renamed from: b */
    @Nullable
    public final List<StreamKey> f12186b;

    public FilteringManifestParser(ParsingLoadable.Parser<? extends T> parser, @Nullable List<StreamKey> list) {
        this.f12185a = parser;
        this.f12186b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    /* renamed from: a */
    public Object mo6752a(Uri uri, InputStream inputStream) throws IOException {
        T mo6752a = this.f12185a.mo6752a(uri, inputStream);
        List<StreamKey> list = this.f12186b;
        return (list == null || list.isEmpty()) ? mo6752a : (FilterableManifest) mo6752a.mo6751a(this.f12186b);
    }
}

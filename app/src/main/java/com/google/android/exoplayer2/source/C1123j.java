package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Consumer;
import com.google.common.collect.ImmutableList;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.source.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C1123j implements Consumer, ProgressiveMediaExtractor.Factory, Bundleable.Creator {

    /* renamed from: c */
    public static final /* synthetic */ C1123j f13401c = new C1123j(0);

    /* renamed from: d */
    public static final /* synthetic */ C1123j f13402d = new C1123j(1);

    /* renamed from: e */
    public static final /* synthetic */ C1123j f13403e = new C1123j(2);

    /* renamed from: f */
    public static final /* synthetic */ C1123j f13404f = new C1123j(3);

    /* renamed from: g */
    public static final /* synthetic */ C1123j f13405g = new C1123j(4);

    /* renamed from: b */
    public final /* synthetic */ int f13406b;

    public /* synthetic */ C1123j(int i2) {
        this.f13406b = i2;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    /* renamed from: a */
    public ProgressiveMediaExtractor mo6849a() {
        return new MediaParserExtractorAdapter();
    }

    @Override // com.google.android.exoplayer2.util.Consumer
    public void accept(Object obj) {
        switch (this.f13406b) {
            case 0:
                ((SampleQueue.SharedSampleMetadata) obj).f12525b.release();
                break;
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.f13406b) {
            case 3:
                Bundleable.Creator<TrackGroup> creator = TrackGroup.f12588e;
                return new TrackGroup((Format[]) BundleableUtil.m7523b(Format.f9640I, bundle.getParcelableArrayList(Integer.toString(0, 36)), ImmutableList.m11627D()).toArray(new Format[0]));
            default:
                TrackGroupArray trackGroupArray = TrackGroupArray.f12592e;
                return new TrackGroupArray((TrackGroup[]) BundleableUtil.m7523b(TrackGroup.f12588e, bundle.getParcelableArrayList(Integer.toString(0, 36)), ImmutableList.m11627D()).toArray(new TrackGroup[0]));
        }
    }
}

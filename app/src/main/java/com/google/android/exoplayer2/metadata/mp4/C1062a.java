package com.google.android.exoplayer2.metadata.mp4;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.common.collect.ComparisonChain;
import com.google.firebase.firestore.model.C2107a;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Util;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.mobile.ads.exo.metadata.mp4.SlowMotionData;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Pair;
import moxy.MvpDelegate;
import moxy.presenter.PresenterField;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.metadata.mp4.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1062a implements Comparator {

    /* renamed from: c */
    public static final /* synthetic */ C1062a f12091c = new C1062a(1);

    /* renamed from: d */
    public static final /* synthetic */ C1062a f12092d = new C1062a(2);

    /* renamed from: e */
    public static final /* synthetic */ C1062a f12093e = new C1062a(3);

    /* renamed from: f */
    public static final /* synthetic */ C1062a f12094f = new C1062a(4);

    /* renamed from: g */
    public static final /* synthetic */ C1062a f12095g = new C1062a(5);

    /* renamed from: h */
    public static final /* synthetic */ C1062a f12096h = new C1062a(6);

    /* renamed from: i */
    public static final /* synthetic */ C1062a f12097i = new C1062a(9);

    /* renamed from: j */
    public static final /* synthetic */ C1062a f12098j = new C1062a(10);

    /* renamed from: k */
    public static final /* synthetic */ C1062a f12099k = new C1062a(11);

    /* renamed from: l */
    public static final /* synthetic */ C1062a f12100l = new C1062a(12);

    /* renamed from: m */
    public static final /* synthetic */ C1062a f12101m = new C1062a(13);

    /* renamed from: b */
    public final /* synthetic */ int f12102b;

    public /* synthetic */ C1062a(int i2) {
        this.f12102b = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        int m22256a;
        int i2 = 0;
        switch (this.f12102b) {
            case 0:
                SlowMotionData.Segment segment = (SlowMotionData.Segment) obj;
                SlowMotionData.Segment segment2 = (SlowMotionData.Segment) obj2;
                return ComparisonChain.f20928a.mo11480b(segment.f12086b, segment2.f12086b).mo11480b(segment.f12087c, segment2.f12087c).mo11479a(segment.f12088d, segment2.f12088d).mo11485g();
            case 1:
                BaseUrl baseUrl = (BaseUrl) obj;
                BaseUrl baseUrl2 = (BaseUrl) obj2;
                int compare = Integer.compare(baseUrl.f12925c, baseUrl2.f12925c);
                return compare != 0 ? compare : baseUrl.f12924b.compareTo(baseUrl2.f12924b);
            case 2:
                return ((Format) obj2).f9655i - ((Format) obj).f9655i;
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = DefaultTrackSelector.f13887f;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                int[] iArr2 = DefaultTrackSelector.f13887f;
                return 0;
            case 5:
                int i3 = C2107a.f22886a;
                return ((Document) obj).getKey().compareTo(((Document) obj2).getKey());
            case 6:
                return ((DocumentKey) obj).compareTo((DocumentKey) obj2);
            case 7:
                FieldIndex fieldIndex = (FieldIndex) obj;
                FieldIndex fieldIndex2 = (FieldIndex) obj2;
                int i4 = FieldIndex.f22852a;
                int compareTo = fieldIndex.mo12417a().compareTo(fieldIndex2.mo12417a());
                if (compareTo != 0) {
                    return compareTo;
                }
                Iterator<FieldIndex.Segment> it = fieldIndex.mo12419c().iterator();
                Iterator<FieldIndex.Segment> it2 = fieldIndex2.mo12419c().iterator();
                while (it.hasNext() && it2.hasNext()) {
                    int compareTo2 = it.next().compareTo(it2.next());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                }
                return Boolean.compare(it.hasNext(), it2.hasNext());
            case 8:
                return FieldIndex.IndexOffset.m12444b((MutableDocument) obj).compareTo(FieldIndex.IndexOffset.m12444b((MutableDocument) obj2));
            case 9:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 10:
                int i5 = Util.f23027a;
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 11:
                DivStatePath divStatePath = (DivStatePath) obj;
                DivStatePath divStatePath2 = (DivStatePath) obj2;
                long j2 = divStatePath.f31331a;
                long j3 = divStatePath2.f31331a;
                if (j2 != j3) {
                    return (int) (j2 - j3);
                }
                int min = Math.min(divStatePath.f31332b.size(), divStatePath2.f31332b.size());
                while (i2 < min) {
                    int i6 = i2 + 1;
                    Pair<String, String> pair = divStatePath.f31332b.get(i2);
                    Pair<String, String> pair2 = divStatePath2.f31332b.get(i2);
                    int compareTo3 = pair.f63055b.compareTo(pair2.f63055b);
                    if (compareTo3 != 0 || pair.f63056c.compareTo(pair2.f63056c) != 0) {
                        return compareTo3;
                    }
                    i2 = i6;
                }
                return divStatePath.f31332b.size() - divStatePath2.f31332b.size();
            case 12:
                m22256a = SlowMotionData.Segment.m22256a((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
                return m22256a;
            default:
                lambda$static$0 = MvpDelegate.lambda$static$0((PresenterField) obj, (PresenterField) obj2);
                return lambda$static$0;
        }
    }
}

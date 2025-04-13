package com.google.android.exoplayer2.extractor.jpeg;

import java.util.List;

/* loaded from: classes.dex */
final class MotionPhotoDescription {

    /* renamed from: a */
    public final long f10980a;

    /* renamed from: b */
    public final List<ContainerItem> f10981b;

    public static final class ContainerItem {

        /* renamed from: a */
        public final String f10982a;

        /* renamed from: b */
        public final long f10983b;

        /* renamed from: c */
        public final long f10984c;

        public ContainerItem(String str, String str2, long j2, long j3) {
            this.f10982a = str;
            this.f10983b = j2;
            this.f10984c = j3;
        }
    }

    public MotionPhotoDescription(long j2, List<ContainerItem> list) {
        this.f10980a = j2;
        this.f10981b = list;
    }
}

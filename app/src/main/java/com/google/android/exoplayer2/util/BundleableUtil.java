package com.google.android.exoplayer2.util;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class BundleableUtil {
    /* renamed from: a */
    public static <T extends Bundleable> ImmutableList<T> m7522a(Bundleable.Creator<T> creator, List<Bundle> list) {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bundle bundle = list.get(i2);
            Objects.requireNonNull(bundle);
            builder.m11640d(creator.fromBundle(bundle));
        }
        return builder.m11641e();
    }

    /* renamed from: b */
    public static <T extends Bundleable> List<T> m7523b(Bundleable.Creator<T> creator, @Nullable List<Bundle> list, List<T> list2) {
        return list == null ? list2 : m7522a(creator, list);
    }

    @Nullable
    /* renamed from: c */
    public static <T extends Bundleable> T m7524c(Bundleable.Creator<T> creator, @Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return creator.fromBundle(bundle);
    }

    /* renamed from: d */
    public static <T extends Bundleable> ArrayList<Bundle> m7525d(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo5679a());
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: e */
    public static Bundle m7526e(@Nullable Bundleable bundleable) {
        if (bundleable == null) {
            return null;
        }
        return bundleable.mo5679a();
    }
}

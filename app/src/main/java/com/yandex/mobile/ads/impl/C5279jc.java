package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.HashSet;

/* renamed from: com.yandex.mobile.ads.impl.jc */
/* loaded from: classes3.dex */
public final class C5279jc {
    @NonNull
    /* renamed from: a */
    public static HashSet m25862a(@NonNull NativeAdAssets nativeAdAssets) {
        HashSet hashSet = new HashSet();
        if (nativeAdAssets.getAge() != null) {
            hashSet.add("age");
        }
        if (nativeAdAssets.getBody() != null) {
            hashSet.add("body");
        }
        if (nativeAdAssets.getCallToAction() != null) {
            hashSet.add("call_to_action");
        }
        if (nativeAdAssets.getDomain() != null) {
            hashSet.add("domain");
        }
        if (nativeAdAssets.getFavicon() != null) {
            hashSet.add("favicon");
        }
        if (nativeAdAssets.getIcon() != null) {
            hashSet.add("icon");
        }
        if (nativeAdAssets.getImage() != null) {
            hashSet.add("media");
        }
        if (nativeAdAssets.getMedia() != null) {
            hashSet.add("media");
        }
        if (nativeAdAssets.getPrice() != null) {
            hashSet.add("price");
        }
        if (nativeAdAssets.getRating() != null) {
            hashSet.add("rating");
        }
        if (nativeAdAssets.getReviewCount() != null) {
            hashSet.add("review_count");
        }
        if (nativeAdAssets.getSponsored() != null) {
            hashSet.add("sponsored");
        }
        if (nativeAdAssets.getTitle() != null) {
            hashSet.add("title");
        }
        if (nativeAdAssets.getWarning() != null) {
            hashSet.add("warning");
        }
        if (nativeAdAssets.isFeedbackAvailable()) {
            hashSet.add("feedback");
        }
        return hashSet;
    }
}

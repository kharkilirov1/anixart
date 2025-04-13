package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.Overlay;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class MemoryDocumentOverlayCache implements DocumentOverlayCache {

    /* renamed from: a */
    public final TreeMap<DocumentKey, Overlay> f22789a = new TreeMap<>();

    /* renamed from: b */
    public final Map<Integer, Set<DocumentKey>> f22790b = new HashMap();
}

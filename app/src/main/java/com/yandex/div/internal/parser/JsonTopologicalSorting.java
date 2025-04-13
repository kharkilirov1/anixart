package com.yandex.div.internal.parser;

import android.annotation.SuppressLint;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonTopologicalSorting.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/parser/JsonTopologicalSorting;", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class JsonTopologicalSorting {

    /* renamed from: a */
    @NotNull
    public static final JsonTopologicalSorting f33826a = new JsonTopologicalSorting();

    /* renamed from: a */
    public final void m17365a(String str, Map<String, List<String>> map, Set<String> set, Set<String> set2, LinkedHashMap<String, Set<String>> linkedHashMap) {
        List list;
        if (set.contains(str)) {
            List m32027j0 = CollectionsKt.m32027j0(set);
            StringBuilder sb = new StringBuilder();
            int size = m32027j0.size();
            for (int indexOf = m32027j0.indexOf(str); indexOf < size; indexOf++) {
                sb.append((String) m32027j0.get(indexOf));
                sb.append(" -> ");
            }
            sb.append(str);
            String sb2 = sb.toString();
            Intrinsics.m32178g(sb2, "output.toString()");
            throw new CyclicDependencyException(sb2);
        }
        if (set2.contains(str)) {
            return;
        }
        List<String> list2 = map.get(str);
        if (list2 == null) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (map.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (!(list == null || list.isEmpty())) {
            set.add(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m17365a((String) it.next(), map, set, set2, linkedHashMap);
            }
            set.remove(str);
        }
        set2.add(str);
        if (list == null) {
            list = EmptyList.f63144b;
        }
        linkedHashMap.put(str, CollectionsKt.m32035n0(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* renamed from: b */
    public final void m17366b(JSONObject jSONObject, boolean z, List<String> list, ParsingErrorLogger logger, ParsingEnvironment env) {
        String str;
        if (z) {
            str = (String) JsonParserKt.m17338a(jSONObject, "type", C2904b.f33862i, logger, env);
        } else {
            Intrinsics.m32179h(jSONObject, "<this>");
            Intrinsics.m32179h(logger, "logger");
            Intrinsics.m32179h(env, "env");
            ?? m17336b = JsonParserInternalsKt.m17336b(jSONObject, "type");
            String str2 = null;
            if (m17336b != 0) {
                if (!(((String) m17336b).length() > 0)) {
                    logger.mo17368a(ParsingExceptionKt.m17520e(jSONObject, "type", m17336b));
                    m17336b = 0;
                }
                str2 = m17336b;
            }
            str = str2;
        }
        if (str != null) {
            list.add(str);
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.m32178g(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            if (obj instanceof JSONObject) {
                Intrinsics.m32178g(key, "key");
                f33826a.m17366b((JSONObject) obj, false, list, logger, env);
            }
        }
        Iterator<String> keys2 = jSONObject.keys();
        Intrinsics.m32178g(keys2, "keys");
        while (keys2.hasNext()) {
            String key2 = keys2.next();
            Object obj2 = jSONObject.get(key2);
            if (obj2 instanceof JSONArray) {
                Intrinsics.m32178g(key2, "key");
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    Object obj3 = jSONArray.get(i2);
                    if (obj3 instanceof JSONObject) {
                        f33826a.m17366b((JSONObject) obj3, false, list, logger, env);
                    }
                    i2 = i3;
                }
            }
        }
    }

    @SuppressLint
    @NotNull
    /* renamed from: c */
    public final Map<String, Set<String>> m17367c(@NotNull JSONObject jSONObject, @NotNull ParsingErrorLogger logger, @NotNull ParsingEnvironment parsingEnvironment) throws JSONException, ParsingException, CyclicDependencyException {
        Intrinsics.m32179h(logger, "logger");
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.m32178g(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            if (obj instanceof JSONObject) {
                Intrinsics.m32178g(key, "key");
                JSONObject jSONObject2 = (JSONObject) obj;
                ArrayList arrayList = new ArrayList();
                f33826a.m17366b(jSONObject2, true, arrayList, new TemplateParsingErrorLogger(logger, key), parsingEnvironment);
                linkedHashMap.put(key, arrayList);
            }
        }
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> linkedHashSet2 = new LinkedHashSet<>();
        LinkedHashMap<String, Set<String>> linkedHashMap2 = new LinkedHashMap<>();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            m17365a((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
        }
        return linkedHashMap2;
    }
}

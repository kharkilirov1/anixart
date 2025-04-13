package com.p017vk.api.sdk.internal;

import android.util.SparseArray;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.swiftsoft.anixartd.network.Response;
import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import okhttp3.internal.http.StatusLine;

/* compiled from: HttpStatus.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/internal/HttpStatus;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class HttpStatus {
    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(100, "Continue");
        sparseArray.put(101, "Switching Protocols");
        sparseArray.put(C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "Processing");
        sparseArray.put(C4632R.styleable.AppCompatTheme_textAppearanceListItem, "Checkpoint");
        sparseArray.put(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, "OK");
        sparseArray.put(201, "Created");
        sparseArray.put(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, "Accepted");
        sparseArray.put(DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, "Non-Authoritative Information");
        sparseArray.put(204, "No Content");
        sparseArray.put(205, "Reset Content");
        sparseArray.put(206, "Partial Content");
        sparseArray.put(207, "Multi-Status");
        sparseArray.put(208, "Already Reported");
        sparseArray.put(226, "IM Used");
        sparseArray.put(300, "Multiple Choices");
        sparseArray.put(301, "Moved Permanently");
        sparseArray.put(302, "Found");
        sparseArray.put(303, "See Other");
        sparseArray.put(304, "Not Modified");
        sparseArray.put(305, "Use Proxy");
        sparseArray.put(StatusLine.HTTP_TEMP_REDIRECT, "Temporary Redirect");
        sparseArray.put(StatusLine.HTTP_PERM_REDIRECT, "Permanent Redirect");
        sparseArray.put(400, "Bad Request");
        sparseArray.put(401, "Unauthorized");
        sparseArray.put(Response.BANNED, "Payment Required");
        sparseArray.put(Response.PERM_BANNED, "Forbidden");
        sparseArray.put(404, "Not Found");
        sparseArray.put(405, "Method Not Allowed");
        sparseArray.put(406, "Not Acceptable");
        sparseArray.put(407, "Proxy Authentication Required");
        sparseArray.put(408, "Request Timeout");
        sparseArray.put(409, "Conflict");
        sparseArray.put(410, "Gone");
        sparseArray.put(411, "Length Required");
        sparseArray.put(412, "Precondition Failed");
        sparseArray.put(413, "Payload Too Large");
        sparseArray.put(414, "URI Too Long");
        sparseArray.put(415, "Unsupported Media Type");
        sparseArray.put(416, "Requested range not satisfiable");
        sparseArray.put(417, "Expectation Failed");
        sparseArray.put(418, "I'm a teapot");
        sparseArray.put(419, "Insufficient Space On Resource");
        sparseArray.put(420, "Method Failure");
        sparseArray.put(StatusLine.HTTP_MISDIRECTED_REQUEST, "Destination Locked");
        sparseArray.put(422, "Unprocessable Entity");
        sparseArray.put(423, "Locked");
        sparseArray.put(424, "Failed Dependency");
        sparseArray.put(426, "Upgrade Required");
        sparseArray.put(428, "Precondition Required");
        sparseArray.put(429, "Too Many Requests");
        sparseArray.put(431, "Request Header Fields Too Large");
        sparseArray.put(500, "Internal Server Error");
        sparseArray.put(501, "Not Implemented");
        sparseArray.put(502, "Bad Gateway");
        sparseArray.put(503, "Service Unavailable");
        sparseArray.put(504, "Gateway Timeout");
        sparseArray.put(505, "HTTP Version not supported");
        sparseArray.put(506, "Variant Also Negotiates");
        sparseArray.put(507, "Insufficient Storage");
        sparseArray.put(508, "Loop Detected");
        sparseArray.put(509, "Bandwidth Limit Exceeded");
        sparseArray.put(510, "Not Extended");
        sparseArray.put(511, "Network Authentication Required");
    }
}

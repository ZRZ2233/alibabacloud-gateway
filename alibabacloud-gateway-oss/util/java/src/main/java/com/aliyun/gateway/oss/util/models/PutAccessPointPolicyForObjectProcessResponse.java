// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.utils.models;

import com.aliyun.tea.*;

public class PutAccessPointPolicyForObjectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static PutAccessPointPolicyForObjectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAccessPointPolicyForObjectProcessResponse self = new PutAccessPointPolicyForObjectProcessResponse();
        return TeaModel.build(map, self);
    }

    public PutAccessPointPolicyForObjectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAccessPointPolicyForObjectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}

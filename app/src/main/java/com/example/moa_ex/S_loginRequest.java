package com.example.moa_ex;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

    public class S_loginRequest extends StringRequest {

        // 서버 URL 설정 ( PHP 파일 연동 )
        final static private String URL = "http://172.30.1.42:3000/Slogin";
        private Map<String, String> map;


        public S_loginRequest(String userID, Response.Listener<String> listener) {
            super(Method.POST, URL, listener, null);

            map = new HashMap<>();
            map.put("userID",userID);

        }

        @Override
        protected Map<String, String> getParams() throws AuthFailureError {
            return map;
        }
    }


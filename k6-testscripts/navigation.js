import http from 'k6/http';
import { sleep } from 'k6';
import { Rate } from 'k6/metrics';
import { SharedArray } from "k6/data";
import papaparse from 'https://jslib.k6.io/papaparse/5.1.1/index.js';
import { randomItem } from "https://jslib.k6.io/k6-utils/1.0.0/index.js";

import { check, group } from 'k6';

export let params = {
	headers: {
		'Accept-Encoding': 'gzip',

	},
	tags:
		{}
};




export let errorRate = new Rate('errors');

export let options = {
	scenarios: {
		base: {
			executor: 'constant-arrival-rate',
			gracefulStop: '10s',
			rate: 500, // Number of iterations to execute each timeUnit period.
			timeUnit: '1s', // Period of time to apply the rate value.
			duration: '10s', // Total scenario duration (excluding gracefulStop)
			preAllocatedVUs: 500, // Number of VUs to pre-allocate before test start in order to preserve runtime resources.
			maxVUs: 2000, // Maximum number of VUs to allow during the test run.
			exec: 'base',
		},

	},
	discardresponsebodies: true,
	useragent: 'k6.io/loadtesting',
	thresholds: {

	}
};

export function base() {


	var body = {

		query: '{navigation{name channel cssActive url path children{name channel cssActive url path children{name channel cssActive url path children{name channel cssActive url path}}}}}',
		variables: {}
	}
	let res1 = http.post(`http://localhost:8080/graphql`, JSON.stringify(body), params)
	//console.log(JSON.stringify(res1))
	const result = check(res1, {
		'response code was 200': (res1) => res1.status == 200,
		//'response stopReason was null': (res1) => res1.json("data.pageApi.stopReason") == undefined,
		//'errors was null': (res1) => res1.json("errors") == undefined,
	});
	errorRate.add(!result);



}

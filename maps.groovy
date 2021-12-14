class maps {
    def arnAsset = [
            APP_NAME: sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()
            ENV: init
            CEPH_DATA:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()
            CEPH_SECRET:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()	
            CEPH_URL:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()	
            CEPH_USER:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()	
            DATA_FEED:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()
            DC:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()
            XMS:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()	
            XMX:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id ${AWS_SECRET}  | jq --raw-output '.ARN'", returnStdout: true).trim()
    ]


    def arnCookie = [
            APP_NAME : "app-web-cookie" ${appName}
            ENV	: init
            AEROSPIKE_URL:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id /dev/${appName}/AEROSPIKE_URL  | jq --raw-output '.ARN'", returnStdout: true).trim()		
            CSV_PATH:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id /dev/${appName}/CSV_PATH  | jq --raw-output '.ARN'", returnStdout: true).trim()	
            DC:	sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id /dev/${appName}/DC  | jq --raw-output '.ARN'", returnStdout: true).trim()
            XMS	:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id /dev/${appName}/XMS  | jq --raw-output '.ARN'", returnStdout: true).trim()
            XMX	:sh(script: "aws secretsmanager get-secret-value --region us-east-1 --secret-id /dev/${appName}/XMX| jq --raw-output '.ARN'", returnStdout: true).trim()
    ]



}

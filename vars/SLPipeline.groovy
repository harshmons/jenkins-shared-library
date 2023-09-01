//
// Copyright (c) 2018 Grid Dynamics International, Inc. All Rights Reserved
// https://www.griddynamics.com
//
// Classification level: Public
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// $Id: $
// @Project:     MPL
// @Description: Shared Jenkins Modular Pipeline Library
//

/**
 * Basic MPL pipeline
 * Shows pipeline with basic stages and modules of the MPL library
 *
 * @author Sergei Parshev <sparshev@griddynamics.com>
 */
def call() {

  pipeline {
    stages {
      stage( 'Checkout' ) {
        
        steps {
          echo "Checkout Stage of Main Shared Library"
        }
      }
      stage( 'Build' ) {
        
        steps {
          echo "Build Stage of Main Shared Library"
        }
      }
      stage( 'Deploy' ) {
        
        steps {
          echo "Deploy Stage of Main Shared Library"
        }
      }
      stage( 'Test' ) {
        
        steps {
          echo "Test Stage of Main Shared Library"
        }
      }
    }
    post {
      always {
        echo "Post Always Stage of Main Shared Library"
      }
      success {
        echo "Post Success Stage of Main Shared Library"
      }
      failure {
        echo "Post Failure Stage of Main Shared Library"
      }
    }
  }
}
